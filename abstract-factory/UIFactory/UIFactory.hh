#pragma once

#include <memory>

#include "../button/Button.hh"
#include "../checkbox/Checkbox.hh"

struct UIFactory {
  virtual std::unique_ptr<Button> createButton() = 0;
  virtual std::unique_ptr<Checkbox> createCheckbox() = 0;
  virtual ~UIFactory() = default;
};
