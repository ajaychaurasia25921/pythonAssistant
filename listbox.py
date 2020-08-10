from tkinter import *
from tkinter import messagebox

win = Tk()
win.geometry('350x250')
name=Label(win,text='Name')
name.place(x=100,y=100)
entry1=Entry(win)
entry1.place(x=150,y=100)
lb=Listbox(win,width=100,height=10)
lb.place(x=150,y=150)
lb.insert(END,'list of Items')
for Items in['Amit','Rahul']:
    lb.insert(END,Items)
def add():
    s=entry1.get()
    lb.insert(END,s)
def dele():
    lb.delete(ANCHOR)
def show():
    s=lb.get(ANCHOR)
    messagebox.showinfo("DATA",s)
b1=Button(win,text='ADD',command=add)
b2=Button(win,text='DEL',command=dele)
b3=Button(win,text='SHOW',command=show)
b1.place(x=150,y=400)
b2.place(x=200,y=400)
b3.place(x=250,y=400)
win.mainloop()
