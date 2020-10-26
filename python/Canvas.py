import tkinter
print("To draw, hold down the left mouse button and move your mouse around")
print("To change your brush color, click on one of the colors.")
window=tkinter.Tk()
canvas=tkinter.Canvas(window,width=750,height=500, bg="white")
canvas.pack()
lastX,lastY=0,0
colour="black"
#keeps track of mouse pointer
def store_position(event):
    global lastX, lastY
    lastX=event.x
    lastY=event.y
#when you click on the canvas
def on_click(event):
    store_position(event)
#draws a line when the mouse pointer is dragged across the canvas
def on_drag(event):
    canvas.create_line(lastX, lastY, event.x, event.y, fill=colour, width=3)
    store_position(event)
canvas.bind("<Button-1>",on_click)
canvas.bind("<B1-Motion>", on_drag)

red_id = canvas.create_rectangle(10, 10, 30, 30, fill="red")
blue_id = canvas.create_rectangle(10, 35, 30, 55, fil="blue")
black_id = canvas.create_rectangle(10, 60, 30, 80, fill="black")
white_id = canvas.create_rectangle(10, 85, 30, 105, fill="white")

def set_colour_red(event):
    global colour
    colour="red"
    
def set_colour_blue(event):
    global colour
    colour="blue"
    
def set_colour_black(event):
    global colour
    colour="black"
    
def set_colour_white(event):
    global colour
    colour="white"
    
canvas.tag_bind(red_id,"<Button-1>", set_colour_red)
canvas.tag_bind(blue_id,"<Button-1>", set_colour_blue)
canvas.tag_bind(black_id,"<Button-1>", set_colour_black)
canvas.tag_bind(white_id,"<Button-1>", set_colour_white)
    
window.mainloop()