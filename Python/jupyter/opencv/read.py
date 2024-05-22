import cv2 as cv

# reading images

# img=cv.imread('photos/cat.jpg')

# cv.imshow('Cat',img)
# cv.waitKey(0) # 0 means wait for infinite time

# reading videos
capture= cv.VideoCapture(0)

while True:
    isTrue,frame=capture.read()
    cv.imshow('Video',frame)

    if cv.waitKey(20) & 0xFF==ord('d'):
        break

capture.release()
cv.destroyAllWindows()



