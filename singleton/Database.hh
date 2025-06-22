#pragma once

#include <memory>
#include <iostream>

class Database {
  static std::unique_ptr<Database> instance;

  Database() {
    std::cout << "Initialazing database\n";
  }

  public:
  Database(const Database& other) = delete;
  Database& operator=(const Database& other) = delete;
  Database(Database&& other) = delete;
  Database& operator=(Database&& other) = delete;

  static Database& getInstance() {
    if (instance == nullptr) {
      instance = std::unique_ptr<Database>(new Database());
    }
    return *instance;
  }
};

std::unique_ptr<Database> Database::instance = nullptr;
