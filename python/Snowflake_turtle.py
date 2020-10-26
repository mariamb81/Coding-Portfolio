from turtle import*
shape("turtle")
speed(10)
pencolor("white")
pensize(6)
hideturtle()
Screen().bgcolor("turquoise")
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
        snowflakeArm()
        right(60)
snowflake()

    
"""
vshape template
right(25)
forward(50)
backward(50)
left(50)
forward(50)
backward(50)
right(25)
"""
