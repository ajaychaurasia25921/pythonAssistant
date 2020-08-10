from tkinter import *
root = Tk()
w=Scale(root,from_ =0,to=40)
w.pack()
w1=Scale(root,from_=0,to=200,orient=HORIZONTAL)
w1.pack()
root.mainloop()
