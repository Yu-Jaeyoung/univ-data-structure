cmake_minimum_required(VERSION 3.23)
project(chap04)

set(CMAKE_CXX_STANDARD 14)

include_directories(.)

add_executable(chap04
        stack_malloc.cpp
        stack_struct_malloc.cpp
        stack_struct.cpp
        maze.cpp
        stack.h
        stack.cpp)
