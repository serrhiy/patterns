#pragma once

struct Button {
  virtual void draw() = 0;
  virtual ~Button() = default;
};
