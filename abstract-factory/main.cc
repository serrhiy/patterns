#include <memory>
#include <string>
#include <map>
#include <functional>

#include "UIFactory/UIFactory.hh"
#include "UIFactory/LinuxUIFactory.hh"
#include "UIFactory/MacUIFactory.hh"

const std::map<std::string, std::string> config {
  { "platform", "macos" }
};

std::unique_ptr<UIFactory> retreiveFactory(const std::string& platform) {
  using FactoryGenerator = std::function<std::unique_ptr<UIFactory>()>;
  
  static const std::map<std::string, FactoryGenerator> cases {
    { "linux", []() { return std::make_unique<LinuxUIFactory>(); } },
    { "macos", []() { return std::make_unique<MacUIFactory>(); } },
  };
  return cases.contains(platform) ? cases.at(platform)() : nullptr;
}

int main(const int argc, const char* argv[]) {
  const auto uifactory = retreiveFactory(config.at("platform"));
  const auto button = uifactory->createButton();
  const auto checkbox = uifactory->createCheckbox();
  button->draw();
  checkbox->draw();
  return 0;
}
