#pragma once

#include <iostream>

#include "Button.hh"

struct LinuxButton: public Button {
  void draw() {
    std::cout << "Drawing Linux Button\n";
  };
};
