#pragma once

#include <memory>

#include "../button/Button.hh"

struct Dialog {

  virtual std::unique_ptr<Button> createButton() = 0;
  
  void render() {
    const auto button = createButton();
    button->onClick([]() { return "Dialog rendered button"; });
    button->render();
  }

  virtual ~Dialog() {}

};
