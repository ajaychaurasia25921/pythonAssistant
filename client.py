import socket
getHOST = (raw_input('Enter the Host: '))
print (getHOST)
HOST = getHOST
PORT = 4444
s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
s.connect((HOST, PORT))

NICK = raw_input('Welcome, Enter your name: ')

while True:
  MSG = raw_input('>> ')
  MSG = NICK + ': ' + MSG
  if MSG[5:] == "exit":
    break
  s.send(MSG)
  data = s.recv(1024)
 print (data)
s.close()