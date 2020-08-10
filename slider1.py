from tkinter import *
from tkinter import messagebox
root = Tk()
var=IntVar()
var.set(0)
def showvalue():
    a=var.get()
    messagebox.showinfo("DATA",a)

w=Scale(root,from_=0,to=200,variable=var,tickinterval=10, length=200)
w.pack()

b1=Button(root,text="Submit",command=showvalue)
b1.pack()

root.mainloop()
