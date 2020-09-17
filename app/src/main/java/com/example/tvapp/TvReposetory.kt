package com.example.tvapp

import java.io.DataOutputStream
import java.net.InetAddress
import java.net.InetSocketAddress
import java.net.Socket

class TvReposetory {
    fun sendMsg(msg: String){
        val addr: InetAddress =  InetAddress.getByName(IP)
        val port = PORT;
        val sockaddr =  InetSocketAddress(addr, port);
        val sock =  Socket();
        sock.connect(sockaddr);
        val out = DataOutputStream(sock.getOutputStream())
        out.write(msg.toByteArray())
        out.flush()
        sock.close()
    }
}