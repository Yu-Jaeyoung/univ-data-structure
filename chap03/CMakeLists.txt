cmake_minimum_required(VERSION 3.23)
project(chap03)

set(CMAKE_CXX_STANDARD 14)

include_directories(.)

add_executable(chap03
        struct.cpp
        typedef_struct.cpp
        polynomial2.cpp
        matrix_transpose.cpp
        swap.cpp
        get_integers.cpp
        )
