#pragma once

#include <memory>

#include "UIFactory.hh"
#include "../button/MacButton.hh"
#include "../checkbox/MacCheckbox.hh"

struct MacUIFactory: public UIFactory {
  std::unique_ptr<Button> createButton() {
    return std::make_unique<MacButton>();
  }
  std::unique_ptr<Checkbox> createCheckbox() {
    return std::make_unique<MacCheckbox>();
  };
};
