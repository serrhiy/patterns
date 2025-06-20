#pragma once

#include <iostream>

#include "Checkbox.hh"

struct MacCheckbox: public Checkbox {
  void draw() {
    std::cout << "Drawing MacOS Checkbox\n";
  };
};
