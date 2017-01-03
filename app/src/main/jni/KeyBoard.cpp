//
// Created by liang on 2017/1/3.
//


#include <stdio.h>
#include <linux/input.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>
#include"Logger.h"
#include<pthread.h>

#include"com_example_liang_myapplication_KeyBoard.h"

#define DEV_PATH "/dev/input/event6"   //difference is possible

static void* pthread_read_keyboard(void*){
    int keys_fd;
    char ret[2];
    struct input_event t;
    keys_fd=open(DEV_PATH, O_RDONLY);
    if(keys_fd <= 0)
    {
        LOGE("%s device error!\n",DEV_PATH);
    }
    for(;;){
        usleep(500);
        if(read(keys_fd, &t, sizeof(t)) == sizeof(t))
        {
            if(t.type==EV_KEY)
                if(t.value==0 || t.value==1)
                {
                    LOGE("key %d %s\n", t.code, (t.value) ? "Pressed" : "Released");
                    if(t.code == KEY_ESC)
                        break;
                }
        }


    }
    LOGE("pthread_read_keyboard exit\n");
    close(keys_fd);
}

JNIEXPORT void JNICALL Java_com_example_liang_myapplication_KeyBoard_Start_1KeyBoard
  (JNIEnv *even, jobject){
    pthread_t pt;
    int re=pthread_create(&pt,NULL,pthread_read_keyboard,NULL);
    if(re!=0){
        LOGE("pthread_create error\n");
    }
    pthread_join(pt,NULL);
    LOGE("OK\n");

}