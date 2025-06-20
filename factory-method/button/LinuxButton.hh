#pragma once

#include <functional>
#include <iostream>
#include <string>

#include "Button.hh"

struct LinuxButton: public Button {
  
  void render() override {
    std::cout << "Render Linux Button\n";
  }

  void onClick(const std::function<std::string()>& callback) override {
    std::cout << "Add Linux Button callback: " << callback() << '\n';
  }

};
