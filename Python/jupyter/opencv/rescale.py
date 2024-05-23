import cv2 as cv



def rescaleFrame(frame,scale=0.75): #video resized by 75%
    width=int(frame.shape[1]*scale)
    height=int(frame.shape[0]*scale)

    dimensions=(width,height)

    return cv.resize(frame,dimensions,interpolation=cv.INTER_AREA)



# reading images

# img=cv.imread('photos/cat.jpg')

# frameresized=rescaleFrame(img)

# cv.imshow('Cat',img)
# cv.imshow('Catresized',frameresized)


# cv.waitKey(0) # 0 means wait for infinite time





capture= cv.VideoCapture('videos/dog.mp4')

while True:
    isTrue,frame=capture.read()
    frameresized=rescaleFrame(frame)



    cv.imshow('Video',frame)
    cv.imshow('resizedframe',frameresized)


    if cv.waitKey(20) & 0xFF==ord('d'):
        break

capture.release()
cv.destroyAllWindows()