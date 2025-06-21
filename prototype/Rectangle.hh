#pragma once

#include <string>
#include <memory>
#include <iostream>

#include "Shape.hh"

class Rectangle: public Shape {
  double width, height;

  public:
  Rectangle(): Shape{}, width{ 0 }, height{ 0 } {}

  Rectangle(Point point, std::string color, double width, double height):
    Shape{ point, color }, width{ width }, height{ height } {}
  
  Rectangle(const Rectangle& other):
    Shape{ other }, width{ other.width },height{ other.height } {}

  bool operator==(const Shape& other) const override {
    const auto rectangle = dynamic_cast<const Rectangle*>(&other);
    if (rectangle == nullptr) return false;
    const auto equal_size = width == rectangle->width && height == rectangle->height;
    return Shape::operator==(other) && equal_size;
  }

  void draw() const override {
    std::cout << "Drawing Rectangle\n";
  }

  std::unique_ptr<Shape> clone() const override {
    return std::make_unique<Rectangle>(point, color, width, height);
  }
};
