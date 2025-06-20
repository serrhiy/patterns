#pragma once

#include <memory>

#include "UIFactory.hh"
#include "../button/LinuxButton.hh"
#include "../checkbox/LinuxCheckbox.hh"

struct LinuxUIFactory: public UIFactory {
  std::unique_ptr<Button> createButton() override{
    return std::make_unique<LinuxButton>();
  }
  std::unique_ptr<Checkbox> createCheckbox() override {
    return std::make_unique<LinuxCheckbox>();
  };
};
