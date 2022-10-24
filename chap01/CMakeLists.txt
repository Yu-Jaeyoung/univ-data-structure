cmake_minimum_required(VERSION 3.23)
project(chap01)

set(CMAKE_CXX_STANDARD 14)

include_directories(.)

add_executable(chap01
        cal_time.cpp)
