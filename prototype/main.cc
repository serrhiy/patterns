#include <iostream>
#include <memory>

#include "Rectangle.hh"

int main(const int argc, const char* argv[]) {
  const auto rectangle1 = std::make_unique<Rectangle>(Point{ 1, 2 }, "green", 13, 24);
  const auto rectangle2 = rectangle1->clone();
  std::cout << (*rectangle1 == *rectangle2) << '\n';
}
