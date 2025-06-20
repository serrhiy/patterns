#pragma once

#include <iostream>

#include "Button.hh"

struct MacButton: public Button {
  void draw() {
    std::cout << "Drawing MacOS Button\n";
  };
};
