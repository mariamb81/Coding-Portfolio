import turtle as t
from itertools import cycle

colors= cycle(["red", "pink", "orange", "yellow", "green", "blue",  "purple"])

def draw_shape(size, angle, shift, shape):
    t.pencolor(next(color))
    t.circle(size)
    t.circle(angle)
    t.forward(shift)
    draw_circle(size+5, angle + 1, shift+1)
    
t.bgcolor("black")
t.speed("fast")
t.pensize(6)
draw_scicrlce(30, 0, 1)
