import socket
import select
import sys

server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
ip=input("enter ip address")
server.connect((ip,1024))
msg=server.recv(1024)
print(msg.decode("utf-8"))
