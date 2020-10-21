package com.nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import java.util.concurrent.*;

/**
 * @author chenchao
 */
public class BIOScoketDemo {

    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(8090);
            while (true){
                Socket client = server.accept();
                System.out.println("当前客户端接受，port="+client.getPort());
                Runnable runnable = new Runnable() {
                    Socket socket = null;
                    public Runnable setSoket(Socket socket) {
                        this.socket = socket;
                        return this;
                    }
                    /* (non-Javadoc)
                     * @see java.lang.Runnable#run()
                     */
                    @Override
                    public void run() {
                        BufferedReader br = null;
                        PrintWriter pw = null;
                        try {
                            pw = new PrintWriter(socket.getOutputStream());
                            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                            while (true) {
                                String line = br.readLine();
                                System.out.println("从客户端来的信息：" + line);
                                pw.println("你好，服务器已经收到您的信息！'" + line + "'\n");
                                pw.flush();
                                System.out.println("已经返回给客户端！");
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        } finally {
                            try {
                                pw.close();
                                br.close();
                                socket.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }

                        }
                    }
                }.setSoket(client);

                new Thread(runnable).start();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
