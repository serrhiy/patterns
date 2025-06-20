#pragma once

#include <iostream>

#include "Checkbox.hh"

struct LinuxCheckbox: public Checkbox {
  void draw() {
    std::cout << "Drawing Linux Checkbox\n";
  };
};
