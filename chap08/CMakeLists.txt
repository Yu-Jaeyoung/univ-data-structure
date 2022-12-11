cmake_minimum_required(VERSION 3.23)
project(chap08)

set(CMAKE_CXX_STANDARD 14)

include_directories(.)

add_executable(chap08
        binarysearchtree.cpp
        binarytree.h
        main.cpp
        traversal.cpp
        thread_traversal.cpp)
