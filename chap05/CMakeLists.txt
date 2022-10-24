cmake_minimum_required(VERSION 3.23)
project(chap05)

set(CMAKE_CXX_STANDARD 14)

include_directories(.)

add_executable(chap05
        queue_linear.cpp
        queue_circle.cpp
        deque.cpp
        deque.h
        deque_main.cpp
        )
