#include <map>
#include <string>
#include <memory>
#include <iostream>
#include <functional>

#include "dialog/Dialog.hh"
#include "dialog/LinuxDialog.hh"
#include "dialog/MacOSDialog.hh"

const std::map<std::string, std::string> config {
  { "platform", "linux" }  
};

std::unique_ptr<Dialog> getDialog(const std::string& platform) {
  using DialogFactory = std::function<std::unique_ptr<Dialog>()>;

  static const std::map<std::string, DialogFactory> cases {
    { "linux", []() { return std::make_unique<LinuxDialog>(); } },
    { "macos", []() { return std::make_unique<MacOSDialog>(); } },
  };
  return cases.contains(platform) ? cases.at(platform)() : nullptr;
}

int main(const int argc, const char* argv[]) {
  const auto dialog = getDialog(config.at("platform"));
  const auto button = dialog->createButton();
  button->onClick([]() { return "some message"; });
  button->render();
  return 0;
}
