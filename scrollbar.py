from tkinter import *
root=Tk()
scrollbar = Scrollbar(root)
scrollbar.pack(side=RIGHT,fill=Y)
mylist=Listbox(root,yscrollcommand=scrollbar.set)
for i in range(100):
    mylist.insert(END,"Number"+str(i))
mylist.pack(side=LEFT,fill=BOTH)
scrollbar.config(command=mylist.yview)
root.mainloop()
