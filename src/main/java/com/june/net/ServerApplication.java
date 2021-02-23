package com.june.net;

import com.june.net.server.NettyServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.InetSocketAddress;

@SpringBootApplication
public class ServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
        NettyServer server = new NettyServer();
        server.startUp(new InetSocketAddress("127.0.0.1", 8090));
    }
}
