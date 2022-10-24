cmake_minimum_required(VERSION 3.23)
project(chap02)

set(CMAKE_CXX_STANDARD 14)

include_directories(.)

add_executable(chap02
        factorial.cpp
        factorial_iter.cpp
        factorial_main.cpp
        slow_power.cpp
        power.cpp
        power_main.cpp
        fib.cpp
        fib_iter.cpp
        fib_main.cpp
        hanoi_tower.cpp
        )
