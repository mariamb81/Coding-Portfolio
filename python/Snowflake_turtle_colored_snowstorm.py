import random
from turtle import*
shape("turtle")
speed(10)
pensize(6)
Screen().bgcolor("turquoise")
colours=["purple","blue","cyan","white","yellow","green","orange","aquamarine","plum","LimeGreen"]
def vshape(size):
    right(25)
    forward(size)
    backward(size)
    left(50)
    forward(size)
    backward(size)
    right(25)
def snowflakeArm(size):
    for x in range(0,4):
        forward(size)
        vshape(size)
    backward(size*4)
def snowflake(size):
    for x in range(0,6):
        color(random.choice(colours))
        snowflakeArm(size)
        right(60)
for i in range(1,10):
    size=random.randint(5,30)
    x= random.randint(-400,400)
    y=random.randint(-400,400)
    penup()
    goto(x,y)
    pendown()
    snowflake(size)
