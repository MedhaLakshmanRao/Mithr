 #import pygame
import cv2
import sys
#from pyzbar import pyzbar
import pyttsx3
#pygame.init()
def webcam():
         cap = cv2.VideoCapture(0)
         while 1:
             ret, frame = cap.read()
             cv2.imshow('object detection',cv2.resize(frame,(800,600)))
             if(cv2.waitKey(1) == ord('c')):
                 ret, frame1 = cap.read()
                 cv2.resize(frame1,(800,600))
                 cv2.imwrite('capture.png',frame1)
                 cap.release()
                 cv2.destroyAllWindows()
                 return
def imgprocess():
    classNames = {0: 'background',
                  1: 'person', 2: 'bicycle', 3: 'car', 4: 'motorcycle', 5: 'airplane', 6: 'bus',
                  7: 'train', 8: 'truck', 9: 'boat', 10: 'traffic light', 11: 'fire hydrant',
                  13: 'stop sign', 14: 'parking meter', 15: 'bench', 16: 'bird', 17: 'cat',
                  18: 'dog', 19: 'horse', 20: 'sheep', 21: 'cow', 22: 'elephant', 23: 'bear',
                  24: 'zebra', 25: 'giraffe', 27: 'backpack', 28: 'umbrella', 31: 'handbag',
                  32: 'tie', 33: 'suitcase', 34: 'frisbee', 35: 'skis', 36: 'snowboard',
                  37: 'sports ball', 38: 'kite', 39: 'baseball bat', 40: 'baseball glove',
                  41: 'skateboard', 42: 'surfboard', 43: 'tennis racket', 44: 'bottle',
                  46: 'wine glass', 47: 'cup', 48: 'fork', 49: 'knife', 50: 'spoon',
                  51: 'bowl', 52: 'banana', 53: 'apple', 54: 'sandwich', 55: 'orange',
                  56: 'broccoli', 57: 'carrot', 58: 'hot dog', 59: 'pizza', 60: 'donut',
                  61: 'cake', 62: 'chair', 63: 'couch', 64: 'potted plant', 65: 'bed',
                  67: 'dining table', 70: 'toilet', 72: 'tv', 73: 'laptop', 74: 'mouse',
                  75: 'remote', 76: 'keyboard', 77: 'cell phone', 78: 'microwave', 79: 'oven',
                  80: 'toaster', 81: 'sink', 82: 'refrigerator', 84: 'book', 85: 'clock',
                  86: 'vase', 87: 'scissors', 88: 'teddy bear', 89: 'hair drier', 90: 'toothbrush'}


    image = cv2.imread("capture.png")
#    barcodes = pyzbar.decode(image)
#    if(len(barcodes)>0):
#        for barcode in barcodes:
#            (x, y, w, h) = barcode.rect
#            cv2.rectangle(image, (x, y), (x + w, y + h), (0, 0, 255), 2)
#            barcodeData = barcode.data.decode("utf-8")
#            barcodeType = barcode.type
#            text = "{} ({})".format(barcodeData, barcodeType)
#            cv2.putText(image, text, (x, y - 10), cv2.FONT_HERSHEY_SIMPLEX,
#            	0.5, (0, 0, 255), 2)
#        cv2.imshow('image', image)
#        print(str(barcodeType) + 'DATA = ' + str(barcodeData))
#        if(cv2.waitKey(0) == ord('q')):
#            cv2.destroyAllWindows()
#            sys.exit()
#        cv2.destroyAllWindows()
#        webcam()
#        imgprocess()

    def id_class_name(class_id, classes):
        for key, value in classes.items():
            if class_id == key:
                return value
                        # Loading model
    model = cv2.dnn.readNetFromTensorflow('frozen_inference_graph.pb','ssd_mobilenet_v2_coco_2018_03_29.pbtxt')
    image = cv2.imread('capture.png')

    image_height, image_width, _ = image.shape

    model.setInput(cv2.dnn.blobFromImage(image, size=(300, 300), swapRB=True))
    output = model.forward()
    names = []
    for detection in output[0, 0, :, :]:
        confidence = detection[2]
        if confidence > .5:
            class_id = detection[1]
            class_name=id_class_name(class_id,classNames)
            names.append(class_name)
            box_x = detection[3] * image_width
            box_y = detection[4] * image_height
            box_width = detection[5] * image_width
            box_height = detection[6] * image_height
            cv2.rectangle(image, (int(box_x), int(box_y)), (int(box_width), int(box_height)), (0, 0, 0), thickness=2)
            cv2.putText(image,class_name ,(int(box_x), int(box_y+.05*image_height)),cv2.FONT_HERSHEY_SIMPLEX,(.005*image_width),(0, 255, 255))
    if(len(names)>1):
        print("MULTIPLE OBJECTS IN SCENE RESCAN")
        webcam()
        imgprocess()
    elif(len(names) == 0):
        print('NO OBJECT')
        webcam()
        imgprocess()
    else:
        print((str(class_name)).upper() + ' DETECTED')
        engine = pyttsx3.init()
        engine.say((str(class_name)).upper())
        engine.runAndWait()
        #pygame.mixer.music.load((str(class_name)).upper() +".wav")
        #pygame.mixer.music.play()
        cv2.imshow('image', image)
        #pygame.event.wait()
    if(cv2.waitKey(0) == ord('q')):
        cv2.destroyAllWindows()
        sys.exit()
    cv2.destroyAllWindows()
    webcam()
    imgprocess()
webcam()
imgprocess()