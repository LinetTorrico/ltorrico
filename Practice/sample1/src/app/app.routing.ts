  import { ModuleWithProviders } from '@angular/core';
  import { Routes, RouterModule } from '@angular/router';

  //Componentes

  import { TiendaComponent } from './tienda/tienda.component';
  import { AnimalsComponent } from './animals/animals.component';
  import { ContactComponent } from './contact/contact.component';
  import { HomeComponent } from './home/home.component';
  import { KeepersComponent } from './keepers/keepers.component';

  const appRouters: Routes = [
      {path: '', component: HomeComponent },
      {path: '', redirectTo:'home', pathMatch: 'full' },
      {path: 'home', component: HomeComponent },
      {path: 'animals', component: AnimalsComponent },
      {path: 'contacto', component: ContactComponent },
      {path: 'cuidadores', component: KeepersComponent },
      {path: '**', component: HomeComponent },

  ];

  export const appRoutingProviders: any[] = [];
  export const routing: ModuleWithProviders = RouterModule.forRoot(appRouters);
