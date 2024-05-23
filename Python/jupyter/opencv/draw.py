import cv2 as cv
import numpy as np


# img=cv.imread("photos/cat.jpg")
# cv.imshow("cat",img)

# creating a blank image
blank=np.zeros((500,500,3),dtype="uint8") #creating a blank image, uint8 is dtype of image
cv.imshow("blank",blank)



cv.waitKey(0)