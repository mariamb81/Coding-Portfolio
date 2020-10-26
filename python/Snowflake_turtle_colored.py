import random
from turtle import*
shape("turtle")
speed(10)
pensize(6)
Screen().bgcolor("turquoise")
colours=["purple","blue","cyan","white","yellow","green","orange","aquamarine","plum","LimeGreen"]
def vshape():
    right(25)
    forward(50)
    backward(50)
    left(50)
    forward(50)
    backward(50)
    right(25)
def snowflakeArm():
    for x in range(0,4):
        forward(30)
        vshape()
    backward(120)
def snowflake():
    for x in range(0,6):
        color(random.choice(colours))
        snowflakeArm()
        right(60)
snowflake()

