import cv2 as cv
import numpy as np


# img=cv.imread("photos/cat.jpg")
# cv.imshow("cat",img)

# creating a blank image
blank=np.zeros((500,500,3),dtype="uint8") #creating a blank image, uint8 is dtype of image
# blank2=np.zeros((500,500,3),dtype="uint8") #creating a blank image, uint8 is dtype of image
# cv.imshow("blank",blank)

# # 1.paint the image a certain color
# blank[:]=0,255,0  #green
# cv.imshow("green",blank)

# blank2[200:300,300:400]=0,255,255   #painting a certain part yellow
# cv.imshow("yellow",blank2) 

# 2.Draw a rectangle
#                  pt1    pt2       color          
# cv.rectangle(blank,(0,0),(250,250),(0,255,0),thickness=2)
# cv.rectangle(blank,(0,0),(250,250),(0,255,0),thickness=cv.FILLED) #filled box
# cv.imshow("rectangle",blank)


# # 3.Draw a circle

# #               midpt    rad   color 
# cv.circle(blank,(250,250),40,(0,255,255),thickness=cv.FILLED)
# cv.imshow("circle",blank)


# # 4.Draw a line

# cv.line(blank,(0,0),(250,250),(255,255,255),thickness=3)
# cv.imshow("line",blank)


# 5. Txt on image
cv.putText(blank,"hello",(255,255),cv.FONT_HERSHEY_DUPLEX,3,(255,255,255),thickness=4)
cv.imshow("text",blank)
cv.waitKey(0)