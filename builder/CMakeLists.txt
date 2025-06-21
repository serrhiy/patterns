cmake_minimum_required(VERSION 3.20..4.0)
project(
  builder
  VERSION 1.0
  DESCRIPTION "Builder pattern example"
  LANGUAGES CXX
)
set(CMAKE_CXX_STANDARD 20)
set(CMAKE_CXX_STANDARD_REQUIRED ON)
add_executable(
  main
  main.cc
)
