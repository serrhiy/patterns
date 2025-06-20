#pragma once

#include <memory>

#include "Dialog.hh"
#include "../button/MacOSButton.hh"

struct MacOSDialog: public Dialog {
  std::unique_ptr<Button> createButton() override {
    return std::make_unique<MacOSButton>();
  }
};
