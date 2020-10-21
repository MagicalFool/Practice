package com.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.sctp.nio.NioSctpServerChannel;
import io.netty.channel.socket.SocketChannel;
import io.netty.util.ReferenceCountUtil;

/**
 * 认识netty
 */
public class L01_NettyHelloWorld {

    private int serverPort;

    ServerBootstrap b = new ServerBootstrap();

    public L01_NettyHelloWorld(int serverPort) {
        this.serverPort = serverPort;
    }

    public void runServer() {
        EventLoopGroup elg = new NioEventLoopGroup(1);
        EventLoopGroup work = new NioEventLoopGroup();
        try {


            // 1. 设置反应器线程组
            b.group(elg, work);
            // 2.设置NIO类型的通道
            b.channel(NioSctpServerChannel.class);
            // 3.设置nio类型的通道
            b.localAddress(serverPort);
            // 4.设置通道的参数
            b.option(ChannelOption.SO_KEEPALIVE, true);
            b.option(ChannelOption.ALLOCATOR, PooledByteBufAllocator.DEFAULT);
            //
            b.childHandler(new ChannelInitializer<SocketChannel>() {
                @Override
                protected void initChannel(SocketChannel socketChannel) throws Exception {
                    socketChannel.pipeline().addLast(new NettyDiscardHandler());
                    ChannelFuture sync = b.bind().sync();
                    ChannelFuture channelFuture = sync.channel().closeFuture();
                    channelFuture.sync();

                }
            });

        } catch (Exception e) {

        } finally {
            work.shutdownGracefully();
            elg.shutdownGracefully();
        }
    }

    public L01_NettyHelloWorld() {
    }

    public static void main(String[] args) {
        int port = 30000;
        new L01_NettyHelloWorld(port).runServer();
    }
}

class NettyDiscardHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        ByteBuf in = (ByteBuf) msg;
        try {
            while (in.isReadable()) {
                System.out.println((char) in.readByte());
            }
        } finally {
            ReferenceCountUtil.release(msg);
        }

//        super.channelRead(ctx, msg);
    }
}