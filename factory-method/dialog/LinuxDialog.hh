#pragma once

#include <memory>

#include "Dialog.hh"
#include "../button/LinuxButton.hh"

struct LinuxDialog: public Dialog {
  std::unique_ptr<Button> createButton() override {
    return std::make_unique<LinuxButton>();
  }
};
