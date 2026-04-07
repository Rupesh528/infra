# -----------------------------
# Provider
# -----------------------------
provider "azurerm" {
  features {}
}

# -----------------------------
# Resource Group
# -----------------------------
resource "azurerm_resource_group" "rg" {
  name     = "hello-devops-rg"
  location = "Central India"

  tags = {
    environment = "dev"
    project     = "hello-devops"
  }
}

# -----------------------------
# AKS Cluster (LOW COST)
# -----------------------------
resource "azurerm_kubernetes_cluster" "aks" {
  name                = "hello-devops-aks"
  location            = azurerm_resource_group.rg.location
  resource_group_name = azurerm_resource_group.rg.name
  dns_prefix          = "hellodevops"

  default_node_pool {
    name       = "nodepool1"
    node_count = 1              #craeted only 1 node cause iam poor to buy subscription
    vm_size = "Standard_B2as_v2"
  }

  identity {
    type = "SystemAssigned"
  }

  tags = {
    environment = "dev"
  }
}

# -----------------------------
# Output kubeconfig
# -----------------------------
output "kube_config" {
  value     = azurerm_kubernetes_cluster.aks.kube_config_raw
  sensitive = true
}
