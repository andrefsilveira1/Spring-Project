import BarChart from 'Components/BarChart';
import DonutsChart from 'Components/DonutsChart';
import Footer from 'Components/Footer';
import NavBar from 'Components/NavBar';
import Table from 'Components/Table';
import React from 'react';

function App() {
  return (
    <>
      <NavBar/>
      <div className="container">
        <h1 className="text-primary py-3">Dashboard</h1>
        <div className="row px-3">
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Porcentagem de Sucesso</h5>
            <BarChart/>
          </div>
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Taxa de venda</h5>
            <DonutsChart/>
          </div>
          <div className="py-3">
            <h2 className="text-primary">Tabela de vendas</h2>
          </div>
        </div>
        <Table/>
      </div>
      <Footer/>
    </>
  );
}

export default App;
