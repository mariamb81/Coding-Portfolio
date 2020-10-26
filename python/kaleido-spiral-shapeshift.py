import turtle as t
from itertools import cycle

colors= cycle(["red", "pink", "orange", "yellow", "green", "blue",  "purple"])

def draw_shape(size, angle, shift, shape):
    #t.bgcolor(next(colors)) *changes bgcolor each loop
    
    t.pencolor(next(colors))
##    next_shape ==""
    shape="circle"
    t.circle(size)
        
##        next_shape="square"
##        
##    elif shape=="square":
##        for i in range(4):
##            t.forward(size*2)
##            t.left(90)
##        next_shape="circle"
        
    t.right(angle)
    t.forward(shift)
    draw_shape(size+5, angle +1, shift+1, shape)

    #change the shift and angles to experiment 
    t.forward(shift)
    t.circle(size)
    draw_circle(size+5,angle+1,shift+1)
    
t.bgcolor("black")
t.speed("fast")
t.pensize(6)
draw_shape(30, 0, 1,"circle")
