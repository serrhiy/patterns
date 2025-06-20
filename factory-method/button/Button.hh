#pragma once

#include <functional>
#include <string>

struct Button {
  virtual void render() = 0;
  virtual void onClick(const std::function<std::string()>& callback) = 0;
  virtual ~Button() {};
};
