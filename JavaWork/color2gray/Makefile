PRJ_NAME=color2gray

GCC=g++

OUTPUT=${PRJ_NAME}
SOURCES=${PRJ_NAME}.cpp
HFILES=stb_image/stb_image.h stb_image/stb_image_write.h
CCFLAGS=-std=c++11 -g3 -O1 -lm

all: ${OUTPUT}
${OUTPUT}:
	${GCC} -o ${OUTPUT} ${CCFLAGS} ${HFILES} ${SOURCES}
    
clean:
	rm -f ${OUTPUT}
   