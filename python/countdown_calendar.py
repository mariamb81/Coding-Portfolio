from tkinter import Tk,Canvas
from datetime import date, datetime

def get_events():
    list_events =[ ]
    
##opens the file called events.txt so the program can read it 
    with open("events.txt") as file:
        
        for line in file:
##remove the newline character from each line
            line = line.rstrip('\n')
            
## splits the string after the comma 
            current_event = line.split(",")

##convert the second item in the list from a string to a item that
##Python can understand as a date
            event_date = datetime.strptime(current_event[1],"%d/%m/%y").date()
## second item is the event date 
            current_event[1]=event_date
            list_events.append(current_event)
        return list_events
    
def days_between_dates(date1, date2):
    time_between = str(date1-date2)
    number_of_days  = time_between.split(" ")
    return number_of_days[0]


##create a tkinter window
root = Tk()
c = Canvas(root, width=800, height =800, bg = "black")
c.pack()
c.create_text(100, 50, anchor ="w", fill="orange",\
font ="Arial 28 bold underline", text ="My Countdown Calendar ")

events = get_events()
today = date.today()

vertical_space = 100
##organizes events in ascending order
##events.sort(key=lamba x: x[1])

for event in events:
     event_name =event[0]
     days_until = days_between_dates(event[1], today)
     display = "It is %s days until %s" % (days_until, event_name )
     
     if (int(days_until)<=7):
         text_col="red"
     else:
        text_col="lightblue"
     c.create_text(100, vertical_space, anchor ="w", fill= "lightBlue",\
                   font="Arial 28 bold", text=display)
     
     vertical_space = vertical_space+30
     
     ##(text= display)displays the text at position 100,100
    ##\ makes the code go over two lines
    
