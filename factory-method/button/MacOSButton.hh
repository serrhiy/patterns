#pragma once

#include <functional>
#include <iostream>
#include <string>

#include "Button.hh"

struct MacOSButton: public Button {
  
  void render() override {
    std::cout << "Render Mac Os Button\n";
  }

  void onClick(const std::function<std::string()>& callback) override {
    std::cout << "Add Mac Os Button callback: " << callback() << '\n';
  }

};
