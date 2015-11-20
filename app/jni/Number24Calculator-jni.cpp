//
// Created by Wenwen on 2015/11/20.
//

#include "Number24Calculator-jni.h"
#include "Number24Calculator.h"
#include <string>

using namespace std;


JNIEXPORT jstring JNICALL Java_com_antee_number24_Number24Calculator_calculate
        (JNIEnv *env, jobject obj, jint a, jint b, jint c, jint d) {
    long data[4];
    data[0] = a;
    data[1] = b;
    data[2] = c;
    data[3] = d;
    int datab[4];
    datab[0] = data[0];
    datab[1] = data[1];
    datab[2] = data[2];
    datab[3] = data[3];
    string result;

    result = Number24::Number24Calculator::calculate(datab);

    return env->NewStringUTF(result.c_str());
}