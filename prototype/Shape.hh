#pragma once

#include <string>
#include <memory>

struct Point {
  double x, y;

  bool operator==(const Point& other) const {
    return x == other.x && y == other.y;
  }
};

class Shape {
  protected:
  
  Point point;
  std::string color;
  
  public:

  Shape(): point{ 0, 0 }, color{ "black" } {}
  Shape(Point point, std::string color): point{ point }, color{ std::move(color) } {}
  Shape(const Shape& other): point{ other.point }, color{ other.color } {}

  virtual ~Shape() = default;

  virtual bool operator==(const Shape& other) const {
    return point == other.point && color == other.color;
  }

  virtual void draw() const = 0;
  virtual std::unique_ptr<Shape> clone() const = 0;
};
